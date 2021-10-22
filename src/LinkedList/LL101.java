public class LL101 {
////    unfold diff approach :
//    void unfold(ListNode *head)
//    {
//        if(head == NULL || head->next == NULL)
//            return;
//
//        ListNode *curr= head, *f2= NULL;
//
//        while( curr->next  != NULL && curr->next->next != NULL){
//            ListNode *f1 = curr->next;
//
//            curr->next = f1->next;
//            f1->next = f2;
//
//            curr = curr->next;
//            f2 = f1;
//        }
//        if(curr->next == NULL)
//            curr->next = f2;
//        else
//            curr->next->next = f2;
//    }


}
