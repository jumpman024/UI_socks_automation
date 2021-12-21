node {
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