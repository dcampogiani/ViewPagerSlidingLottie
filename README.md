# ViewPagerSlidingLottie

![Demo](https://github.com/dcampogiani/ViewPagerSlidingLottie/blob/master/demo.gif?raw=true)

## How to do it

Add LottieAnimationView to XML:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/header"
        android:layout_width="match_parent"
        android:layout_height="240dp"
        android:scaleType="centerCrop"
        app:lottie_rawRes="@raw/header" />

    <android.support.v4.view.ViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
```

Setup with ViewPager

```kotlin
pager.adapter = Adapter(...)
header.setupWithViewPager(pager)
```

## Thanks
 - [Lottie File](https://www.lottiefiles.com/77-im-thirsty)
 - [Inspiration](https://medium.com/google-developers/introduction-to-motionlayout-part-iii-47cd64d51a5)
