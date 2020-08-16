ALiteCore - Android Litecoin Core
=================================

[![Build Status](https://travis-ci.org/tech1k/alitecore.svg?branch=master)](https://travis-ci.org/tech1k/alitecore)

<a href="https://alitecore.com"> <img src="https://alitecore.com/assets/images/og-image.jpg" alt="ALiteCore Banner" width="477.5" height="250"></a>

Website: <a href="https://alitecore.com">alitecore.com</a>

Warning: This app is still in development.

<!--<a href="https://f-droid.org/packages/com.greenaddress.abcore/" target="_blank">
<img src="https://f-droid.org/badge/get-it-on.png" height="90"/></a>
<a href="https://play.google.com/apps/testing/com.greenaddress.abcore" target="_blank">
<img src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png" height="90"/></a>

If you want to try it, you can also get it directly from GitHub [here](https://github.com/tech1k/alitecore/releases/).-->

What is Android Litecoin Core?
------------------------------

Android Litecoin Core is an Android app that fetches the litecoin core daemon built for Android using the NDK and is meant to make it easier
to run a Litecoin Core daemon node on always on Android set top box devices and home appliances as well as mobile devices.

The full node software (Litecoin Core 0.18.1) is meant to be used as a personal node when on the go (either by using a mobile wallet that allows to connect to a remote and specific node or even directly on your mobile device).

ALiteCore works on x86, x86_64, armhf and arm64 Android (any version from Lollipop onwards - sdk 21). Mips is not supported.

License
-------

ALiteCore is released under the terms of the MIT license. See [COPYING](COPYING) for more
information or see https://opensource.org/licenses/MIT.

Privacy
-------

ALiteCore doesn't do any kind of phone home, doesn't have In-App Purchase or advertising.

During the initial configuration it connects to Github to fetch the required binaries and once it is installed it only communicates with the rest of the Litecoin network like any normal full node.

Limitations
-----------

ALiteCore requires a fair amount of ram (2GB reccomended) and a fair amount of disk space (~23GB for non pruned node) as well as a decent always on connection - 3G or 4G is not advised.

We also do not advise to use this as a wallet at this time, we advise to use this as your personal blockchain anchor when on the go with wallets that support to set a personal node.

The contributors of ALiteCore are not liable for any cost or damage caused by the app including but not limited to data charges/penalties.

Acknowledgement
---------------

- Development

Kristian Kramer
<a href="https://kristian-kramer.com">kristian-kramer.com</a>

- ABCore

GreenAddress
<a href="https://github.com/greenaddress">github.com/greenaddress</a>


