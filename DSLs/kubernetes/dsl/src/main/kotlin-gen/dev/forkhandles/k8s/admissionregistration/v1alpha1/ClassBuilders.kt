// GENERATE
package dev.forkhandles.k8s.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.AuditAnnotation as v1alpha1_AuditAnnotation
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ExpressionWarning as v1alpha1_ExpressionWarning
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchCondition as v1alpha1_MatchCondition
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.NamedRuleWithOperations as v1alpha1_NamedRuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamKind as v1alpha1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamRef as v1alpha1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.TypeChecking as v1alpha1_TypeChecking
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy as v1alpha1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding as v1alpha1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList as v1alpha1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList as v1alpha1_ValidatingAdmissionPolicyList
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyStatus as v1alpha1_ValidatingAdmissionPolicyStatus
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.Validation as v1alpha1_Validation
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.Variable as v1alpha1_Variable

fun newAuditAnnotation(block: v1alpha1_AuditAnnotation.() -> Unit = {}): v1alpha1_AuditAnnotation {
    val instance = v1alpha1_AuditAnnotation()
    instance.block()
    return instance
}

fun newExpressionWarning(block: v1alpha1_ExpressionWarning.() -> Unit = {}): v1alpha1_ExpressionWarning {
    val instance = v1alpha1_ExpressionWarning()
    instance.block()
    return instance
}

fun newMatchCondition(block: v1alpha1_MatchCondition.() -> Unit = {}): v1alpha1_MatchCondition {
    val instance = v1alpha1_MatchCondition()
    instance.block()
    return instance
}

fun newMatchResources(block: v1alpha1_MatchResources.() -> Unit = {}): v1alpha1_MatchResources {
    val instance = v1alpha1_MatchResources()
    instance.block()
    return instance
}

fun newNamedRuleWithOperations(block: v1alpha1_NamedRuleWithOperations.() -> Unit = {}): v1alpha1_NamedRuleWithOperations {
    val instance = v1alpha1_NamedRuleWithOperations()
    instance.block()
    return instance
}

fun newParamKind(block: v1alpha1_ParamKind.() -> Unit = {}): v1alpha1_ParamKind {
    val instance = v1alpha1_ParamKind()
    instance.block()
    return instance
}

fun newParamRef(block: v1alpha1_ParamRef.() -> Unit = {}): v1alpha1_ParamRef {
    val instance = v1alpha1_ParamRef()
    instance.block()
    return instance
}

fun newTypeChecking(block: v1alpha1_TypeChecking.() -> Unit = {}): v1alpha1_TypeChecking {
    val instance = v1alpha1_TypeChecking()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicy(block: v1alpha1_ValidatingAdmissionPolicy.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicy {
    val instance = v1alpha1_ValidatingAdmissionPolicy()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBinding(block: v1alpha1_ValidatingAdmissionPolicyBinding.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBinding {
    val instance = v1alpha1_ValidatingAdmissionPolicyBinding()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingList(block: v1alpha1_ValidatingAdmissionPolicyBindingList.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBindingList {
    val instance = v1alpha1_ValidatingAdmissionPolicyBindingList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyBindingSpec(block: v1alpha1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBindingSpec {
    val instance = v1alpha1_ValidatingAdmissionPolicyBindingSpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyList(block: v1alpha1_ValidatingAdmissionPolicyList.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyList {
    val instance = v1alpha1_ValidatingAdmissionPolicyList()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicySpec(block: v1alpha1_ValidatingAdmissionPolicySpec.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicySpec {
    val instance = v1alpha1_ValidatingAdmissionPolicySpec()
    instance.block()
    return instance
}

fun newValidatingAdmissionPolicyStatus(block: v1alpha1_ValidatingAdmissionPolicyStatus.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyStatus {
    val instance = v1alpha1_ValidatingAdmissionPolicyStatus()
    instance.block()
    return instance
}

fun newValidation(block: v1alpha1_Validation.() -> Unit = {}): v1alpha1_Validation {
    val instance = v1alpha1_Validation()
    instance.block()
    return instance
}

fun newVariable(block: v1alpha1_Variable.() -> Unit = {}): v1alpha1_Variable {
    val instance = v1alpha1_Variable()
    instance.block()
    return instance
}
