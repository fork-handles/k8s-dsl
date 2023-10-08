// GENERATE
package dev.forkhandles.k8s.admissionregistration.v1beta1

import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.AuditAnnotation as v1beta1_AuditAnnotation
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ExpressionWarning as v1beta1_ExpressionWarning
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MatchCondition as v1beta1_MatchCondition
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MatchResources as v1beta1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhook as v1beta1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfiguration as v1beta1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.MutatingWebhookConfigurationList as v1beta1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.NamedRuleWithOperations as v1beta1_NamedRuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ParamKind as v1beta1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ParamRef as v1beta1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ServiceReference as v1beta1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.TypeChecking as v1beta1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicy as v1beta1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBinding as v1beta1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingList as v1beta1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyBindingSpec as v1beta1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyList as v1beta1_ValidatingAdmissionPolicyList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicySpec as v1beta1_ValidatingAdmissionPolicySpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingAdmissionPolicyStatus as v1beta1_ValidatingAdmissionPolicyStatus
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhook as v1beta1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfiguration as v1beta1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.ValidatingWebhookConfigurationList as v1beta1_ValidatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.Validation as v1beta1_Validation
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.Variable as v1beta1_Variable
import io.fabric8.kubernetes.api.model.admissionregistration.v1beta1.WebhookClientConfig as v1beta1_WebhookClientConfig

fun newAuditAnnotation(block: v1beta1_AuditAnnotation.() -> Unit = {}): v1beta1_AuditAnnotation {
    val instance = v1beta1_AuditAnnotation()
    instance.block()
    return instance
}

fun newExpressionWarning(block: v1beta1_ExpressionWarning.() -> Unit = {}): v1beta1_ExpressionWarning {
    val instance = v1beta1_ExpressionWarning()
    instance.block()
    return instance
}

fun newMatchCondition(block: v1beta1_MatchCondition.() -> Unit = {}): v1beta1_MatchCondition {
    val instance = v1beta1_MatchCondition()
    instance.block()
    return instance
}

fun newMatchResources(block: v1beta1_MatchResources.() -> Unit = {}): v1beta1_MatchResources {
    val instance = v1beta1_MatchResources()
    instance.block()
    return instance
}

fun newMutatingWebhook(block: v1beta1_MutatingWebhook.() -> Unit = {}): v1beta1_MutatingWebhook {
    val instance = v1beta1_MutatingWebhook()
    instance.block()
    return instance
}

fun newMutatingWebhookConfiguration(block: v1beta1_MutatingWebhookConfiguration.() -> Unit = {}): v1beta1_MutatingWebhookConfiguration {
    val instance = v1beta1_MutatingWebhookConfiguration()
    instance.block()
    return instance
}

fun newMutatingWebhookConfigurationList(block: v1beta1_MutatingWebhookConfigurationList.() -> Unit = {}): v1beta1_MutatingWebhookConfigurationList {
    val instance = v1beta1_MutatingWebhookConfigurationList()
    instance.block()
    return instance
}

fun newNamedRuleWithOperations(block: v1beta1_NamedRuleWithOperations.() -> Unit = {}): v1beta1_NamedRuleWithOperations {
    val instance = v1beta1_NamedRuleWithOperations()
    instance.block()
    return instance
}

fun newParamKind(block: v1beta1_ParamKind.() -> Unit = {}): v1beta1_ParamKind {
    val instance = v1beta1_ParamKind()
    instance.block()
    return instance
}

fun newParamRef(block: v1beta1_ParamRef.() -> Unit = {}): v1beta1_ParamRef {
    val instance = v1beta1_ParamRef()
    instance.block()
    return instance
}

fun newServiceReference(block: v1beta1_ServiceReference.() -> Unit = {}): v1beta1_ServiceReference {
    val instance = v1beta1_ServiceReference()
    instance.block()
    return instance
}

fun newTypeChecking(block: v1beta1_TypeChecking.() -> Unit = {}): v1beta1_TypeChecking {
    val instance = v1beta1_TypeChecking()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicy(block: v1beta1_ValidatingAdmissionPolicy.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicy {
    val instance = v1beta1_ValidatingAdmissionPolicy()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBinding(block: v1beta1_ValidatingAdmissionPolicyBinding.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicyBinding {
    val instance = v1beta1_ValidatingAdmissionPolicyBinding()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingList(block: v1beta1_ValidatingAdmissionPolicyBindingList.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicyBindingList {
    val instance = v1beta1_ValidatingAdmissionPolicyBindingList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingSpec(block: v1beta1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicyBindingSpec {
    val instance = v1beta1_ValidatingAdmissionPolicyBindingSpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyList(block: v1beta1_ValidatingAdmissionPolicyList.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicyList {
    val instance = v1beta1_ValidatingAdmissionPolicyList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicySpec(block: v1beta1_ValidatingAdmissionPolicySpec.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicySpec {
    val instance = v1beta1_ValidatingAdmissionPolicySpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyStatus(block: v1beta1_ValidatingAdmissionPolicyStatus.() -> Unit = {}): v1beta1_ValidatingAdmissionPolicyStatus {
    val instance = v1beta1_ValidatingAdmissionPolicyStatus()
    instance.block()
    return instance
}

fun newValidatingWebhook(block: v1beta1_ValidatingWebhook.() -> Unit = {}): v1beta1_ValidatingWebhook {
    val instance = v1beta1_ValidatingWebhook()
    instance.block()
    return instance
}

fun newValidatingWebhookConfiguration(block: v1beta1_ValidatingWebhookConfiguration.() -> Unit = {}): v1beta1_ValidatingWebhookConfiguration {
    val instance = v1beta1_ValidatingWebhookConfiguration()
    instance.block()
    return instance
}

fun newValidatingWebhookConfigurationList(block: v1beta1_ValidatingWebhookConfigurationList.() -> Unit = {}): v1beta1_ValidatingWebhookConfigurationList {
    val instance = v1beta1_ValidatingWebhookConfigurationList()
    instance.block()
    return instance
}

fun newValidation(block: v1beta1_Validation.() -> Unit = {}): v1beta1_Validation {
    val instance = v1beta1_Validation()
    instance.block()
    return instance
}

fun newVariable(block: v1beta1_Variable.() -> Unit = {}): v1beta1_Variable {
    val instance = v1beta1_Variable()
    instance.block()
    return instance
}

fun newWebhookClientConfig(block: v1beta1_WebhookClientConfig.() -> Unit = {}): v1beta1_WebhookClientConfig {
    val instance = v1beta1_WebhookClientConfig()
    instance.block()
    return instance
}
