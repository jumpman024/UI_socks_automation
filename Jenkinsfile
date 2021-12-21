node {
       stage('checkout repo') {
            git branch: 'origin/master',
            credentialsId: 'ccc32da8-6b39-485a-abec-9503b81f9b68'
            url: 'https://github.com/jumpman024/UI_socks_automation.git'

        }
        stage('run ui tests') {
           sh "./gradlew ui:test -Dlogging=${LOGGING}"
        }

        allure([
        includeProperties: false,
        jdk: '',
        properties: [],
        reportBuildPolicy: 'ALWAYS',
        results: [path: 'ui-test/build/allure-results']
       ])
}