pipeline {
     agent any
     stages {
          stage("Checkout") {
               steps {
                    withCredentials([sshUserPrivateKey(credentialsId: 'github-personal-key', keyFileVariable: 'SSH_KEY')]) {
                         git url: 'https://github.com/brundaged/calculator.git', branch: 'main'
                    }
               }
          }
          stage("Build") {
               steps {
                    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"
               }
          }
          stage("Code coverage") {
               steps {
                    sh "./gradlew jacocoTestReport"
                    publishHTML (target: [
                         reportDir: 'build/reports/jacoco/test/html',
                         reportFiles: 'index.html',
                         reportName: "JaCoCo Report"
                    ])
                    sh "./gradlew jacocoTestCoverageVerification"
               }
          }
          stage("Static code analysis") {
               steps {
                    sh "./gradlew checkstyleMain"
                    publishHTML (target: [
                         reportDir: 'build/reports/checkstyle',
                         reportFiles: 'main.html',
                         reportName: "Checkstyle Report"
                    ])                    
               }
          }
     }
     post {
          failure {
               mail to: 'derrick.brundage@gmail.com',
               subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
               body: "Something is wrong with ${env.BUILD_URL}"
          }
          always {
               slackSend channel: '#jenkins-pipeline',
               color: 'danger',
               message: "Pipeline ${currentBuild.fullDisplayName} status is ${currentBuild.result}."
          }
     }
}
