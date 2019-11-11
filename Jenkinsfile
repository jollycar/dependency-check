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
                dependencyCheckPublisher pattern: '', \
                failedNewCritical: 0, failedNewHigh: 1, failedNewMedium: 4, failedNewLow: 8, \
                failedTotalCritical: 0, failedTotalHigh: 1, failedTotalMedium: 4, failedTotalLow: 8, \
                unstableNewCritical: 0, unstableNewHigh: 1, unstableNewMedium: 2, unstableNewLow: 4, \
                unstableTotalCritical: 0, unstableTotalHigh: 1, unstableTotalMedium: 2, unstableTotalLow: 4
            }
        }
    }
}
