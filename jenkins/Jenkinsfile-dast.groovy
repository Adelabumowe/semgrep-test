pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Qualys scan'){
            steps {
                qualysWASScan authRecord: 'none', cancelOptions: 'none', credsId: 'a512603e-b571-4169-92a5-62cdd0f517c9', isSev1Vulns: true, isSev2Vulns: true, isSev3Vulns: true, isSev4Vulns: true, isSev5Vulns: true, optionProfile: 'other', optionProfileId: '2802136', platform: 'EU_PLATFORM_2', pollingInterval: '5', scanName: '[job_name]_jenkins_build_[build_number]', scanType: 'VULNERABILITY', severity1Limit: 2, severity2Limit: 3, severity3Limit: 2, severity4Limit: 2, severity5Limit: 2, vulnsTimeout: '2*60', webAppId: '258412127'
            }
        } 
    }
}