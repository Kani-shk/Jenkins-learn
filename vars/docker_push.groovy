def call(String ProjectName, String ImageTag, String DockerHubUser) {
    withCredentials([usernamePassword(
        credentialsId: "DockerHub_cred",
        passwordVariable: "dockerHubPass",
        usernameVariable: "dockerHubUser"
    )]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
    }
}
