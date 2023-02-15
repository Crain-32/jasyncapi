package com.asyncapi.v2._6_0.model.security_scheme.oauth2.flow;

import lombok.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

/**
 * This object MAY be extended with <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#specificationExtensions">Specification Extensions</a>.
 *
 * @version 2.6.0
 * @see <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#oauthFlowObject">OAuth Flow Object</a>
 * @author Pavel Bodiachevskii
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AuthorizationCodeOAuthFlow extends OAuthFlow {

    /**
     * REQUIRED.
     * <p>
     * The authorization URL to be used for this flow. This MUST be in the form of an absolute URL.
     */
    @Nonnull
    private String authorizationUrl;

    /**
     * REQUIRED.
     * <p>
     * The token URL to be used for this flow. This MUST be in the form of an absolute URL.
     */
    @Nonnull
    private String tokenUrl;

    @Builder(builderMethodName = "authorizationCodeOAuthFlowBuilder")
    public AuthorizationCodeOAuthFlow(@Nullable String refreshUrl,
                                      @Nonnull Map<String, String> scopes,
                                      @Nonnull String authorizationUrl,
                                      @Nonnull String tokenUrl) {
        super(refreshUrl, scopes);
        this.authorizationUrl = authorizationUrl;
        this.tokenUrl = tokenUrl;
    }

}