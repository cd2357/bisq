## Run Bisq from source

### Pre-requisites

* You have installed Java v10 or higher
  * Check by running `java --version`
* You have installed git lfs
  * Check by running `git lfs version`
  * If not available, get it and install it from the [git lfs repo](https://github.com/git-lfs/git-lfs/releases)

### Get Bisq code

* Clone the Bisq repo
  * `git clone https://github.com/bisq-network/bisq.git`
* Go inside the cloned Bisq git repo
  * `cd bisq`
* Switch to a specific release (for example, v1.3.4)
  * `git checkout tags/v1.3.4`
* Build it
  * `./gradlew build`
* Run it
  * `./bisq-desktop`
