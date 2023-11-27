---
title: Btp Installation & Configuration
meta_desc: Information on how to install the Btp provider.
layout: installation
---

## Installation

The Pulumi Btp provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@lechnerc77/pulumi-btp`](https://www.npmjs.com/package/@lechnerc77/pulumi-btp)
* Python: [`lechnerc77_pulumi_btp`](https://pypi.org/project/lechnerc77_pulumi_btp/)
* Go: [`github.com/lechnerc77/pulumi-btp/sdk/go/btp`](https://pkg.go.dev/github.com/lechnerc77/pulumi-btp/sdk/go/btp)
* .NET: [`Lechnerc77-pulumi-btp.Btp`](https://www.nuget.org/packages/Lechnerc77-pulumi-btp.Btp)


## Configuration

> Note:  
> Replace the following **sample content**, with the configuration options
> of the wrapped Terraform provider and remove this note.

The following configuration points are available for the `btp` provider:

- `btp:apiKey` (environment: `btp_API_KEY`) - the API key for `btp`
- `btp:region` (environment: `btp_REGION`) - the region in which to deploy resources

### Provider Binary

The Btp provider binary is a third party binary. It can be installed using the `pulumi plugin` command.

```bash
pulumi plugin install resource btp <version>
```

Replace the version string `<version>` with your desired version.
