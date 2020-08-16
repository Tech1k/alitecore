package com.greenaddress.abcore;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class PackagesUnitTest {

    private void downloadPackage(final String distro, final String arch) throws IOException, NoSuchAlgorithmException {
        final String url = Packages.getPackageUrl(distro, arch);

        final String filePath = InstrumentationRegistry.getInstrumentation().getTargetContext().getNoBackupFilesDir().getAbsoluteFile() + "/" + url.substring(url.lastIndexOf("/") + 1);
        Utils.downloadFile(url, filePath);
        final List<String> hashes = Packages.NATIVE_CORE;

        for (final String a : hashes) {
            final String h = a.substring(7);
            if (h.startsWith(arch)) {
                Utils.validateSha256sum(arch, h, filePath);
                break;
            }
        }

        //noinspection ResultOfMethodCallIgnored
        new File(filePath).delete();
    }

    private void downloadCorePackage(final String arch) throws IOException, NoSuchAlgorithmException {
        downloadPackage("core", arch);
    }

    @Test
    public void testArm64Packages() throws IOException, NoSuchAlgorithmException {
        downloadCorePackage("aarch64-linux-android");
    }

    @Test
    public void testAmd64Packages() throws IOException, NoSuchAlgorithmException {
        downloadCorePackage("x86_64-linux-android");
    }

    @Test
    public void testi386Packages() throws IOException, NoSuchAlgorithmException {
        downloadCorePackage("i686-linux-android");
    }

    @Test
    public void testArmHfPackages() throws IOException, NoSuchAlgorithmException {
        downloadCorePackage("arm-linux-androideabi");
    }
}