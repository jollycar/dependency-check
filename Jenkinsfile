pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Dependency check') {
            steps {
                dependencyCheck additionalArguments: '--suppression owasp-suppression.xml', odcInstallation: 'dependency-check'
                dependencyCheckPublisher pattern: ''
            }
        }
    }
}
