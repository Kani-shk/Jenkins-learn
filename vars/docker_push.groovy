def call(String Projectname, String ImageTag, String dockerHubuser){
                withCredentials([usernamePassword(
                    credentialsId: "DockerHub_cred",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubuser"
                )]) {
                    sh "docker login -u ${dockerHubuser} -p ${dockerHubPass}"
                }
                    sh "docker push ${dockerHubuser}/${ProjectName}:${ImageTag}

