pipeline {
     agent any
     stages {
          stage("Checkout") {
               steps {
                    withCredentials([string(credentialsId: 'github-personal-key', variable: 'SSH_KEY')]) {
                         git url: 'https://github.com/brundaged/calculator.git', branch: 'main'
                    }
               }
          }
     }
}
