# gson-demo

## gson对象
```java
//通过构造函数来获取
Gson gson = new Gson();
//通过 GsonBuilder 来获取，可以进行多项特殊配置
Gson gson = new GsonBuilder().create();
```

## Build
```shell
bazel build //:gson
```


## Run
```shell
bazel-bin/gson
```

## Result
```text
hello!!! start gson!!
javaBean => json ===={
  "username": "张三",
  "password": "pass123",
  "money": 500
}

json => javaBean ====张三--pass123--500

list => json ====[
  {
    "username": "张三",
    "password": "pass123",
    "money": 500
  },
  {
    "username": "李四",
    "password": "pass111",
    "money": 3000
  }
]

json => list ====张三--pass123--500

json => list ====李四--pass111--3000

map => json ===={
  "p1": {
    "username": "张三",
    "password": "pass123",
    "money": 500
  },
  "p2": {
    "username": "李四",
    "password": "pass111",
    "money": 3000
  }
}

json => map ====张三--pass123--500

json => map ====李四--pass111--3000

```
