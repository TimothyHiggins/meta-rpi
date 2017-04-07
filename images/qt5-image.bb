SUMMARY = "A Qt5 development image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require qt5-basic-image.bb

QT5_PKGS = " \
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtlocation-plugins \
    qtmultimedia \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtsensors-plugins \
    qtsvg \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtwebsockets-qmlplugins \
    qtxmlpatterns \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
"

QML_APPS = " \
    qqtest \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
    ${QML_APPS} \
"

export IMAGE_BASENAME = "qt5-image"
