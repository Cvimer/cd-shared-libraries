def call(Closure body) {
    def nodeName = "master"
    if ("a" != "a") {
        nodeName = "slave"
    }
    node(nodeName) {
        stage('Config') {
            echo 'Building....'
        }
        stage('Test') {
            echo 'Testing....'
        }
        stage('Deploy') {
            echo 'Deploying....'
        }
    }

}