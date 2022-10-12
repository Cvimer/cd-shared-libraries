def java_config_scm_compiler_docker_k8s() {
    node {
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