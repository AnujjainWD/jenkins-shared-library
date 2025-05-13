package org.demo

class Utils implements Serializable {

    def steps

    Utils(steps = null) {
        this.steps = steps
    }

    def printEnvInfo() {
        steps.echo "🔧 ENVIRONMENT: ${steps.env.ENVIRONMENT ?: 'dev'}"
        steps.echo "🏷️ BUILD NUMBER: ${steps.env.BUILD_NUMBER}"
        steps.echo "🕒 TIMESTAMP: ${new Date()}"
    }

    def notifySlack(String status) {
        def color = status == "SUCCESS" ? "good" : "danger"
        steps.slackSend(
            color: color,
            message: "*Build ${status}*: Job '${steps.env.JOB_NAME} [#${steps.env.BUILD_NUMBER}]' - ${steps.env.BUILD_URL}"
        )
    }
}
