def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub', 
        passwordVariable: 'PASSWORD', 
        usernameVariable: 'USER')]) 
        {
            sh "docker login -u '$USER' -p '$PASSWORD'"
        }
        sh "docker image push ${hubUser}/${project}:${ImageTag}"
        sh "docker image push ${hubUser}/${project}:latest"
}