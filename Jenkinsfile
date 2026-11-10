pipeline {
    agent any

    stages {
        // stage('Pull Code') {
        //     steps {
        //         git branch: 'main', url: 'https://github.com/<your-username>/demo-app.git'
        //     }
        // }

        stage('Build JAR') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw -B clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t demo-app:latest .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker rm -f demo-app || true'
                sh 'docker run -d --name demo-app -p 8081:8080 demo-app:latest'
            }
        }
    }
}