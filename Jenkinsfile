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
                dependencyCheckPublisher failedNewCritical: 0, failedNewHigh: 0, failedNewLow: 0, failedNewMedium: 0, failedTotalCritical: 0, failedTotalHigh: 0, failedTotalLow: 0, failedTotalMedium: 0, pattern: '', unstableNewCritical: 0, unstableNewHigh: 0, unstableNewLow: 0, unstableNewMedium: 0, unstableTotalCritical: 0, unstableTotalHigh: 0, unstableTotalLow: 0, unstableTotalMedium: 0
            }
        }
    }
}
