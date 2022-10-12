import com.cvimer.pipelines.config.Config
import com.cvimer.pipelines.scm.Scm
import com.cvimer.pipelines.compiler.Compiler
import com.cvimer.pipelines.docker.Docker
import com.cvimer.pipelines.deploy.Deploy


def call(Closure body) {
//    def nodeName = "master"
//    if ("a" != "a") {
//        nodeName = "slave"
//    }
    node() {
        config()
        scm()
        compiler()
        docker()
        deploy()
    }

}