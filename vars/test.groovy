def call(String name = "DevOps Ninjas") {
    echo "🧪 Running test for: ${name}"

    def utils = new org.demo.Utils()
    utils.printEnvInfo()
}
