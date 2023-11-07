pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent {'label JenkinsSlave-java'}

    tools {
        maven 'maven_3.9.5'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'Code Compilation is started'
                sh 'mvn clean compile'
				echo 'Code Compilation is Completed Successfully!'
            }
        }
        stage('Code QA Execution') {
            steps {
                echo 'Junit Test case check in Progress!'
                sh 'mvn clean test'
            }
        }
        stage('Code Package') {
            steps {
                echo 'Creating War Artifact'
                sh 'mvn clean package'
                echo 'MVN package is completed'
            }
        }
    }
}