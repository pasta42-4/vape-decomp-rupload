/*
 * Decompiled with CFR 0.152.
 */
package com.app.system.configuration;

import com.adapter.management.GenericAdapterManager;
import com.analytics.compression.AdvancedMetricCompressor;
import com.app.core.generics.GenericTypeResolver;
import com.auth.tracking.AuthenticationStateTracker;
import com.config.schema.ConfigurationSchemaResolver;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.crypto.streaming.CipherStreamProcessor;
import com.data.transformation.DataTransformationDispatcher;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.game.core.GameStateController;
import com.graphics.rendering.GraphicalRenderingController52;
import com.integration.system.InteroperabilityBridge;
import com.network.connection.NetworkConnectionDescriptor;
import com.network.state.NetworkStateManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.security.authentication.AuthenticationContextManager;
import com.security.authentication.AuthenticationTokenManager;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.CryptographicKeyManager2476;
import com.security.decryption.CryptographicKeyDecoder;
import com.security.encryption.CipherContextManager;
import com.security.streaming.StreamCipherOrchestrator183;
import com.security.streaming.StreamCipherTransformer;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationProfileManager1223;
import com.system.resource.ResourceAllocator;
import com.util.numeric.NumericFormattingUtility;
import com.util.reflection.ReflectionUtility;
import com.xml.processing.XmlHandler;

public class RuntimeConfigurationBuilder {
    public static ConfigurationProfileResolver h(GenericTypeResolver genericTypeResolver) {
        Object t = genericTypeResolver.n();
        Object t2 = ((ConfigurationProfileResolver)t).s();
        ((ConfigurationProfileResolver)t2).t(((ConfigurationProfileResolver)t).u());
        ((ConfigurationProfileResolver)t2).H(genericTypeResolver.T());
        ((ConfigurationProfileResolver)t2).V(new XmlHandler(genericTypeResolver, t2));
        return t2;
    }

    public static AbstractComputationKernel m(ConfigurationProfileResolver<?, ?> configurationProfileResolver) {
        return RuntimeConfigurationBuilder.s(configurationProfileResolver, false);
    }

    public static AbstractComputationKernel s(ConfigurationProfileResolver<?, ?> configurationProfileResolver, boolean bl) {
        AbstractComputationKernel abstractComputationKernel;
        block26: {
            block28: {
                block29: {
                    block27: {
                        abstractComputationKernel = configurationProfileResolver.z();
                        if (configurationProfileResolver instanceof AuthenticationStateTracker) {
                            abstractComputationKernel = new AdaptiveCipherEngine((AuthenticationStateTracker)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof CryptographicKeyManager2476) {
                            abstractComputationKernel = new InteroperabilityBridge((CryptographicKeyManager2476)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof GenericAdapterManager) {
                            abstractComputationKernel = new ExecutionStateValidator((GenericAdapterManager)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof NumericPrecisionTransformer) {
                            abstractComputationKernel = new AdvancedMetricCompressor((NumericPrecisionTransformer)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof NumericFormattingUtility) {
                            abstractComputationKernel = new GraphicalRenderingController52((NumericFormattingUtility)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof AdaptiveRenderingEngine) {
                            abstractComputationKernel = new NetworkStateManager((AdaptiveRenderingEngine)configurationProfileResolver);
                        } else if (configurationProfileResolver instanceof NetworkConnectionDescriptor) {
                            abstractComputationKernel = new GameStateController((NetworkConnectionDescriptor)configurationProfileResolver);
                            NetworkConnectionDescriptor networkConnectionDescriptor = (NetworkConnectionDescriptor)configurationProfileResolver;
                            if (networkConnectionDescriptor.G() instanceof AuthenticationStateTracker) {
                                AuthenticationStateTracker authenticationStateTracker = (AuthenticationStateTracker)networkConnectionDescriptor.G();
                                try {
                                    if (authenticationStateTracker.C() == null || !authenticationStateTracker.C().equals(networkConnectionDescriptor)) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeConfigurationBuilder.a(customSystemException);
                                }
                                abstractComputationKernel = null;
                            }
                        } else {
                            try {
                                if (!(configurationProfileResolver instanceof DataTransformationDispatcher)) break block27;
                                if (bl) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeConfigurationBuilder.a(customSystemException);
                            }
                            abstractComputationKernel = new AuthenticationContextManager((DataTransformationDispatcher)configurationProfileResolver);
                        }
                        break block26;
                    }
                    try {
                        if (!(configurationProfileResolver instanceof ReflectionUtility)) break block28;
                        if (!bl) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeConfigurationBuilder.a(customSystemException);
                    }
                    abstractComputationKernel = new ResourceAllocator((ReflectionUtility)configurationProfileResolver);
                    break block26;
                }
                abstractComputationKernel = new StreamCipherTransformer((ReflectionUtility)configurationProfileResolver);
                break block26;
            }
            if (configurationProfileResolver instanceof ConfigurationSchemaResolver) {
                abstractComputationKernel = new AuthenticationTokenManager((ConfigurationSchemaResolver)configurationProfileResolver);
            } else if (configurationProfileResolver instanceof CipherStreamProcessor) {
                abstractComputationKernel = new ConfigurationProfileManager1223((CipherStreamProcessor)configurationProfileResolver);
            } else if (configurationProfileResolver instanceof StreamCipherOrchestrator183) {
                abstractComputationKernel = new CipherContextManager((StreamCipherOrchestrator183)configurationProfileResolver);
            }
        }
        return abstractComputationKernel;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static Object B(Object object) {
        block4: {
            try {
                try {
                    if (!(object instanceof CryptographicKeyDecoder) && !(object instanceof RecursiveNodeTreeBuilder)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeConfigurationBuilder.a(customSystemException);
                }
                return object.toString();
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeConfigurationBuilder.a(customSystemException);
            }
        }
        return null;
    }
}

