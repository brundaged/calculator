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
     }
}
