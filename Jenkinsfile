pipeline {

    agent any
    /*agent {
        node {
            label ""
            customWorkspace "/var/lib/jenkins/workspace/Pipeline1/RefactorAdapterPattern"
        }
    }*/

    parameters {
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Build Version')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building version ${parameters.VERSION}'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing version ${parameters.VERSION}'
                sh './gradlew test'
            }
            /*post {
                always {
                    junit allowEmptyResults: false, testResults: "build/reports/tests/test/*.html"
                }
            }*/
        }
    }
}