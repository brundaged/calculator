pipeline {
     agent any
     stages {
          stage("Checkout") {
               steps {
                    withCredentials([string(credentialsId: 'brundaged', variable: 'SSH_KEY')]) {
                         git url: 'https://github.com/brundaged/calculator.git', branch: 'main'
                    }
               }
          }
     }
}
