import setuptools
import re
from subprocess import Popen, PIPE


def get_current_version_tag():
    # Get tags on the current checked out commit only
    process = Popen(["git", "describe", "--tags", "HEAD"], stdout=PIPE)
    (output, err) = process.communicate()
    process.wait()

    tags = str(output, "utf-8").strip().split("\n")

    if len(tags) == 1:
        return tags.pop()[1:]
    else:
        # throw error
        raise Exception("Could not determine version")


with open("README.md", "r") as readme_file:
    long_description = readme_file.read()

setuptools.setup(
    name="nitric-api",
    version=get_current_version_tag(),
    author="Nitric",
    author_email="maintainers@nitric.io",
    description="The Nitric base SDK for Python 3",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="https://github.com/nitrictech/apis",
    packages=setuptools.find_packages(exclude=["tests", "tests.*"]),
    license_files=("LICENSE.txt",),
    classifiers=[
        "Programming Language :: Python :: 3",
        "Operating System :: OS Independent",
    ],
    setup_requires=["wheel"],
    install_requires=[
        "protobuf==3.13.0",
        "betterproto==2.0.0b3",
        "asyncio",
    ],
    extras_require={
        "dev": [
            "betterproto[compiler]==2.0.0b3",
            # "grpcio==1.33.2",
            "grpcio-tools==1.33.2",
            "twine==3.2.0",
        ]
    },
    python_requires=">=3.7",
)
