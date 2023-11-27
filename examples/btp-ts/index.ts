import * as btp from "@lechnerc77/pulumi-btp"

const directory = new btp.Directory("my-pulumi-dir")

export const directoryId = directory.id