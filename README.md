# 概要
マテリアルデザインのToolbarを実装
ToolbarにSearchViewを追加
バックキーを一回押してSearch Viewを閉じる

## マテリアルデザインのToolbarを実装
1. R.style のAppTheme のParentを "Theme.Appcompat.Light.NoActionBar" に変更してデフォルトのToolbarを表示させない
2. R.menu に "search.xml" を作成してツールバーレイアウトの中身を作る
3. R.layout に "activity_main.xml" を追加。
4. activity_main.xml に "android.support.v7.widget.Toolbar" を追加。
5. elevationを4dpにして影をつける。Toolbarは4dpらしい。http://www.tomo.mobi/?p=405
6. MainActivity#onCreateでToolbarを実装

## ToolbarにSearchViewを実装
1. MainActivity#onCreateOptionsMenuでsearchViewを実装
2. setOnQueryTextListenerで変更を検知

## バックキーを一回押してSearch View を閉じる
http://tech.chitgoks.com/2016/01/06/how-to-collapse-searchview-when-back-key-is-pressed/

# 参考URL
https://qiita.com/suzukihr/items/9042ae3416ed5ae1cca2
