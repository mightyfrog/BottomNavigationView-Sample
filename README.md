# BottomNavigationView Sample

## How to change text size

Override these two dimen attributes:

- design_bottom_navigation_text_size
- design_bottom_navigation_active_text_size

ex.

```xml
<dimen name="design_bottom_navigation_text_size" tools:override="true">10sp</dimen>
<dimen name="design_bottom_navigation_active_text_size" tools:override="true">10sp</dimen>
```

## How to change icon size

Set **app:itemIconSize** in the BottomNavigationView tag.

ex.

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    ...
    app:itemIconSize="34dp"
    ...
    ... />
```

## How to display icons and texts at all time

Set **app:labelVisibilityMode="labeled"** in the BottomNavigationView tag.

ex.

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    ...
    app:labelVisibilityMode="labeled"
    ...
    ... />
```

|selected|labled|unlabled|
|:------:|:----:|:------:|
|<img src="static/sc1.png" width=250/>|:<img src="static/sc2.png" width=250/>:|:<img src="static/sc3.png" width=250/>:|

## Add extra space between icon and text

Override **design_bottom_navigation_height** to increase the height of BottomNavigationView.

ex.

```xml
<dimen name="design_bottom_navigation_height" tools:override="true">60dp</dimen>
```
