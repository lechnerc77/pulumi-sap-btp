package shim

import (
	"github.com/SAP/terraform-provider-btp/internal/provider"
	tf "github.com/hashicorp/terraform-plugin-framework/provider"
)

func NewProvider() tf.Provider {
		return provider.New()
}
