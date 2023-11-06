pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent { label 'JenkinsSlave' }

    tools {
        maven 'maven_3.9.5'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'code compilation is starting'
                sh 'mvn clean compile'
				echo 'code compilation is completed'
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
                echo 'code packing is starting'
                sh 'mvn clean package'
				echo 'code packing is completed'

            }
        }
    }
}