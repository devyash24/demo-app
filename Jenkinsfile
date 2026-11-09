pipeline {
    agent any

    options {
        timestamps()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw -B clean verify'
            }
        }
    }

    post {
        always  { junit 'target/surefire-reports/*.xml' }
        success { archiveArtifacts artifacts: 'target/*.jar', fingerprint: true }
        failure { echo '❌ Build failed. Check the test report above.' }
    }
}