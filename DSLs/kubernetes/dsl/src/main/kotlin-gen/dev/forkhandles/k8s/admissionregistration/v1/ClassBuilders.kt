// GENERATE
package dev.forkhandles.k8s.admissionregistration.v1

import io.fabric8.kubernetes.api.model.admissionregistration.v1.AuditAnnotation as v1_AuditAnnotation
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ExpressionWarning as v1_ExpressionWarning
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MatchCondition as v1_MatchCondition
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MatchResources as v1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhook as v1_MutatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfiguration as v1_MutatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.MutatingWebhookConfigurationList as v1_MutatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.NamedRuleWithOperations as v1_NamedRuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ParamKind as v1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ParamRef as v1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1.Rule as v1_Rule
import io.fabric8.kubernetes.api.model.admissionregistration.v1.RuleWithOperations as v1_RuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ServiceReference as v1_ServiceReference
import io.fabric8.kubernetes.api.model.admissionregistration.v1.TypeChecking as v1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicy as v1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBinding as v1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingList as v1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyBindingSpec as v1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyList as v1_ValidatingAdmissionPolicyList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicySpec as v1_ValidatingAdmissionPolicySpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingAdmissionPolicyStatus as v1_ValidatingAdmissionPolicyStatus
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhook as v1_ValidatingWebhook
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfiguration as v1_ValidatingWebhookConfiguration
import io.fabric8.kubernetes.api.model.admissionregistration.v1.ValidatingWebhookConfigurationList as v1_ValidatingWebhookConfigurationList
import io.fabric8.kubernetes.api.model.admissionregistration.v1.Validation as v1_Validation
import io.fabric8.kubernetes.api.model.admissionregistration.v1.Variable as v1_Variable
import io.fabric8.kubernetes.api.model.admissionregistration.v1.WebhookClientConfig as v1_WebhookClientConfig

fun newAuditAnnotation(block: v1_AuditAnnotation.() -> Unit = {}): v1_AuditAnnotation {
    val instance = v1_AuditAnnotation()
    instance.block()
    return instance
}

fun newExpressionWarning(block: v1_ExpressionWarning.() -> Unit = {}): v1_ExpressionWarning {
    val instance = v1_ExpressionWarning()
    instance.block()
    return instance
}

fun newMatchCondition(block: v1_MatchCondition.() -> Unit = {}): v1_MatchCondition {
    val instance = v1_MatchCondition()
    instance.block()
    return instance
}

fun newMatchResources(block: v1_MatchResources.() -> Unit = {}): v1_MatchResources {
    val instance = v1_MatchResources()
    instance.block()
    return instance
}

fun newMutatingWebhook(block: v1_MutatingWebhook.() -> Unit = {}): v1_MutatingWebhook {
    val instance = v1_MutatingWebhook()
    instance.block()
    return instance
}

fun newMutatingWebhookConfiguration(block: v1_MutatingWebhookConfiguration.() -> Unit = {}): v1_MutatingWebhookConfiguration {
    val instance = v1_MutatingWebhookConfiguration()
    instance.block()
    return instance
}

fun newMutatingWebhookConfigurationList(block: v1_MutatingWebhookConfigurationList.() -> Unit = {}): v1_MutatingWebhookConfigurationList {
    val instance = v1_MutatingWebhookConfigurationList()
    instance.block()
    return instance
}

fun newNamedRuleWithOperations(block: v1_NamedRuleWithOperations.() -> Unit = {}): v1_NamedRuleWithOperations {
    val instance = v1_NamedRuleWithOperations()
    instance.block()
    return instance
}

fun newParamKind(block: v1_ParamKind.() -> Unit = {}): v1_ParamKind {
    val instance = v1_ParamKind()
    instance.block()
    return instance
}

fun newParamRef(block: v1_ParamRef.() -> Unit = {}): v1_ParamRef {
    val instance = v1_ParamRef()
    instance.block()
    return instance
}

fun newRule(block: v1_Rule.() -> Unit = {}): v1_Rule {
    val instance = v1_Rule()
    instance.block()
    return instance
}

fun newRuleWithOperations(block: v1_RuleWithOperations.() -> Unit = {}): v1_RuleWithOperations {
    val instance = v1_RuleWithOperations()
    instance.block()
    return instance
}

fun newServiceReference(block: v1_ServiceReference.() -> Unit = {}): v1_ServiceReference {
    val instance = v1_ServiceReference()
    instance.block()
    return instance
}

fun newTypeChecking(block: v1_TypeChecking.() -> Unit = {}): v1_TypeChecking {
    val instance = v1_TypeChecking()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicy(block: v1_ValidatingAdmissionPolicy.() -> Unit = {}): v1_ValidatingAdmissionPolicy {
    val instance = v1_ValidatingAdmissionPolicy()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBinding(block: v1_ValidatingAdmissionPolicyBinding.() -> Unit = {}): v1_ValidatingAdmissionPolicyBinding {
    val instance = v1_ValidatingAdmissionPolicyBinding()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingList(block: v1_ValidatingAdmissionPolicyBindingList.() -> Unit = {}): v1_ValidatingAdmissionPolicyBindingList {
    val instance = v1_ValidatingAdmissionPolicyBindingList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingSpec(block: v1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}): v1_ValidatingAdmissionPolicyBindingSpec {
    val instance = v1_ValidatingAdmissionPolicyBindingSpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyList(block: v1_ValidatingAdmissionPolicyList.() -> Unit = {}): v1_ValidatingAdmissionPolicyList {
    val instance = v1_ValidatingAdmissionPolicyList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicySpec(block: v1_ValidatingAdmissionPolicySpec.() -> Unit = {}): v1_ValidatingAdmissionPolicySpec {
    val instance = v1_ValidatingAdmissionPolicySpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyStatus(block: v1_ValidatingAdmissionPolicyStatus.() -> Unit = {}): v1_ValidatingAdmissionPolicyStatus {
    val instance = v1_ValidatingAdmissionPolicyStatus()
    instance.block()
    return instance
}

fun newValidatingWebhook(block: v1_ValidatingWebhook.() -> Unit = {}): v1_ValidatingWebhook {
    val instance = v1_ValidatingWebhook()
    instance.block()
    return instance
}

fun newValidatingWebhookConfiguration(block: v1_ValidatingWebhookConfiguration.() -> Unit = {}): v1_ValidatingWebhookConfiguration {
    val instance = v1_ValidatingWebhookConfiguration()
    instance.block()
    return instance
}

fun newValidatingWebhookConfigurationList(block: v1_ValidatingWebhookConfigurationList.() -> Unit = {}): v1_ValidatingWebhookConfigurationList {
    val instance = v1_ValidatingWebhookConfigurationList()
    instance.block()
    return instance
}

fun newValidation(block: v1_Validation.() -> Unit = {}): v1_Validation {
    val instance = v1_Validation()
    instance.block()
    return instance
}

fun newVariable(block: v1_Variable.() -> Unit = {}): v1_Variable {
    val instance = v1_Variable()
    instance.block()
    return instance
}

fun newWebhookClientConfig(block: v1_WebhookClientConfig.() -> Unit = {}): v1_WebhookClientConfig {
    val instance = v1_WebhookClientConfig()
    instance.block()
    return instance
}
