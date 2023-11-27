ARG VARIANT=bullseye
FROM --platform=amd64 mcr.microsoft.com/devcontainers/go:1.21-${VARIANT}

# Install pulumictl
ARG PULUMICTL_VERSION=v0.0.45
RUN rm -rf /usr/local/bin/pulumictl && \
    wget -O pulumictl.${PULUMICTL_VERSION}.tar.gz https://github.com/pulumi/pulumictl/releases/download/${PULUMICTL_VERSION}/pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz && \
    tar -C /usr/local/bin -xzf pulumictl.${PULUMICTL_VERSION}.tar.gz