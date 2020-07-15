# BottomNavigationView Sample

## Change text size

Override these two dimen attributes:

- design_bottom_navigation_text_size
- design_bottom_navigation_active_text_size

ex.

```xml
<dimen name="design_bottom_navigation_text_size" tools:override="true">10sp</dimen>
<dimen name="design_bottom_navigation_active_text_size" tools:override="true">10sp</dimen>
```

## Change icon size

Set **app:itemIconSize** in the BottomNavigationView tag.

ex.

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    ...
    app:itemIconSize="34dp"
    ...
    ... />
```

## Display icons and texts at all time

Set **app:labelVisibilityMode="labeled"** in the BottomNavigationView tag.

ex.

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    ...
    app:labelVisibilityMode="labeled"
    ...
    ... />
```

|selected|labeled|unlabeled|
|:--:|:--:|:--:|
|<img src="static/sc1.png" width=250/>|<img src="static/sc2.png" width=250/>|<img src="static/sc3.png" width=250/>|

## Add extra space between icon and text

Override **design_bottom_navigation_height** to increase the height of BottomNavigationView.

ex.

```xml
<dimen name="design_bottom_navigation_height" tools:override="true">60dp</dimen>
```

## Change the back button behavior

Remove **app:defaultNavHost="true"** or set it to false so the back button doesn't defaults to the start destination (app:startDestination="@+id/navigation_home" in mobile_navigation.xml).

ex.

```xml
<fragment
    ...
    app:defaultNavHost="true"
    ...
    ... />
```