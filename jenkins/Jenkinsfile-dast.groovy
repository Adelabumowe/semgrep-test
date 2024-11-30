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
                qualysWASScan authRecord: 'none', cancelHours: '1', cancelOptions: 'xhours', credsId: 'a1be2a3d-86c9-4c2e-a4a0-ac976fd3902f', isSev4Vulns: true, isSev5Vulns: true, optionProfile: 'other', optionProfileId: '2802136', platform: 'EU_PLATFORM_2', pollingInterval: '5', scanName: '[job_name]_jenkins_build_[build_number]', scanType: 'VULNERABILITY', severity4Limit: 2, severity5Limit: 2, vulnsTimeout: '1*60', webAppId: '258412127'
            }
        } 
    }
}