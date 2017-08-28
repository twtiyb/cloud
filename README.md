# cloud
## 组件化


- 修改本地hosts

```
0.0.0.0 configserver
0.0.0.0 discovery
0.0.0.0 gateway-service
0.0.0.0 item-api
0.0.0.0 user-api
0.0.0.0 order-api
```
- 启动`discovery`,`configserver`,`gateway-service`,`item-api`

- 查看disvoery控制台`http://localhost:8761`或者`http://discovery:8761`
- 通过gateway访问item `http://gateway-service:10000/item-api/item/getProfile`


## 