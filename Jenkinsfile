node {
       stage('checkout repo') {
            git branch: 'origin/master',
            credentialsId: 'e3f5ec5c-cc17-462e-950a-f342a1c87f4e'
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