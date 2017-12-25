# SnackBarUtil
* 带颜色的SnackBar,提供了文字和背景颜色的设置以及图标的设置

 ![Image](https://github.com/huweijian5/SnackBarUtil/blob/master/screenshots/device-2016-11-30-162154.mp4_1480494504.gif)
---
## 使用说明
* 如果需要修改颜色，可在主工程的colors.xml里添加修改
```xml
<resources>
    <color name="j_snack_alert">#129BFF</color>
    <color name="j_snack_warning">#FEB500</color>
    <color name="j_snack_error">#FF5B3B</color>
</resources>
```


## JavaDoc文档

* [在线JavaDoc](https://jitpack.io/com/github/huweijian5/SnackBarUtil/1.0.1/javadoc/index.html)
* 网址：`https://jitpack.io/com/github/huweijian5/SnackBarUtil/[VersionCode]/javadoc/index.html`
* 其中[VersionCode](https://github.com/huweijian5/SnackBarUtil/releases)请替换为最新版本号
* 注意文档使用UTF-8编码，如遇乱码，请在浏览器选择UTF-8编码即可

---

---
## 引用

* 如果需要引用此库,做法如下：
* Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```	
* and then,add the dependecy:
```
dependencies {
	        compile 'com.github.huweijian5:SnackBarUtil:latest_version'
}
```
* 其中latest_version请到[releases](https://github.com/huweijian5/SnackBarUtil/releases)中查看
