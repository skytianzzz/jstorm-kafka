package storm.kafka;

/**
 * Date: 11/05/2013
 * Time: 14:38
 */
public class ZkHosts implements BrokerHosts {//用于保存kafka使用zk的相关信息，节点和路径
    private static final String DEFAULT_ZK_PATH = "/brokers";

    public String brokerZkStr = null;
    public String brokerZkPath = null; // e.g., /kafka/brokers
    public int refreshFreqSecs = 60;

    public ZkHosts(String brokerZkStr, String brokerZkPath) {
        this.brokerZkStr = brokerZkStr;
        this.brokerZkPath = brokerZkPath;
    }

    public ZkHosts(String brokerZkStr) {
        this(brokerZkStr, DEFAULT_ZK_PATH);
    }
}