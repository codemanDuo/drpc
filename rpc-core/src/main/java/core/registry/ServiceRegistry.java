package core.registry;

/**
 * 服务注册接口
 */
public interface ServiceRegistry {

    /**
     * 将服务注册进服务中心
     * @param service 服务实体
     * @param <T> 服务类
     */
    <T> void register(T service);

    /**
     * 根据服务名称获得服务
     * @param serviceName 服务名称
     * @return 服务类对象
     */
    Object getService(String serviceName);
}
