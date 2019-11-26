def call(Map stageParams) {
   checkout(
   [$class: 'GitSCM', 
    branches: [[name: '*/master']],
    doGenerateSubmoduleConfigurations: false,
    userRemoteConfigs: [[url: 'https://github.com/Yogendrasingh-Rathore/Jenkins-sharedLibrary.git']]]
   )
}
