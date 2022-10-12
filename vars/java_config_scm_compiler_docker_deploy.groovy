def call(Closure body) {
    def nodeName = "Built-In Node"
    if ("a" != "a") {
        nodeName = "slave"
    }
    node(nodeName) {
        stage('Build') {
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