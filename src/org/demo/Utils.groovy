package org.demo

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def printEnvInfo(env) {
        steps.echo "🔧 Job Name: ${env.JOB_NAME}"
        steps.echo "🌿 Branch: ${env.BRANCH_NAME}"
        steps.echo "📂 Workspace: ${env.WORKSPACE}"
    }
}
