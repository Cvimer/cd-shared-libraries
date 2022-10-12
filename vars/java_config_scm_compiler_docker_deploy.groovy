import com.cvimer.pipelines.config.Config
import com.cvimer.pipelines.scm.Scm
import com.cvimer.pipelines.compiler.Compiler
import com.cvimer.pipelines.docker.Docker
import com.cvimer.pipelines.deploy.Deploy
import com.cvimer.pipelines.variable.VariableSet


def call(Closure body) {
//    def nodeName = "master"
//    if ("a" != "a") {
//        nodeName = "slave"
//    }
//    node {
//        stage('Example') {
//            if (env.BRANCH_NAME == 'master') {
//                echo 'I only execute on the master branch'
//            } else {
//                echo 'I execute elsewhere'
//            }
//        }
//    }
    VariableSet variableSet = new VariableSet()
    node() {
        // 配置项目
        Config config = new Config()
        config.config(variableSet)

        // 检出代码
        Scm scm = new Scm()
        scm.scm(variableSet)

        // 编译项目
        Compiler compiler = new Compiler()
        compiler.compiler()

        // 构建Docker镜像
        Docker docker = new Docker()
        docker.buildDockerImage()

        //发布k8s
        Deploy deploy = new Deploy()
        deploy.deploy()
    }

}