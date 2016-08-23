DESCRIPTION = "Minimal ptest image for NI Linux Real-Time x64 and ARM targets"
LICENSE = "MIT"

require minimal-nilrt-image.bb

IMAGE_FEATURES+=" ptest-pkgs"

# ensure these packages are included, since we added ptests to them
IMAGE_INSTALL += "\
	ptest-runner \
	rt-tests \
	kernel-tests-ptest \
	glibc-tests-ptest \
	salt-ptest \
"

IMAGE_ROOTFS_EXTRA_SPACE = "1000000"
