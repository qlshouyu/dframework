# 基础设施层 Infrastructure Layer
传统的基础设施层被所有层依赖，这里我们
基于依赖倒置原则，基础设施层依赖其它所有层，因为其它层中只有接口，所有实现都在基础设施层中
## 指责
提供各层的实现，包括数据存储，缓存等等实现基础层功能