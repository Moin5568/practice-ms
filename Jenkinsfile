pipeline {
    agent any // Use any available agent (node) for this pipeline

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from a version control system (e.g., Git)
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build your application (e.g., compile code)
                sh 'mvn clean package' // Example for a Maven project
            }
        }

        stage('Test') {
            steps {
                // Run your tests
                sh 'mvn test' // Example for running tests with Maven
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application to a server or container
                sh 'docker-compose up -d' // Example for deploying with Docker
            }
        }
    }
}
